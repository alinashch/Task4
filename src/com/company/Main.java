package com.company;

import java.util.ArrayList;
import java.util.List;


public class Main {
    static class Segment  {
      public int start, end;
      public Segment(int start,int end){
          this.end=end;
          this.start=start;
      }
    };

    public static Segment solveProblem(List<Segment> segments) {
        ArrayList<coordinates>coordinates=new ArrayList<>();
        for(Segment i: segments){
            coordinates.add(new coordinates(i.start,in.B));
            coordinates.add(new coordinates(i.end, in.E));
        }
        int n=0;
        int MaxN=0;
        ArrayList<coordinates> list=QuickSort.sort(coordinates);
        Segment res=new Segment(list.get(0).value,0);
        for(coordinates i: list){
            if(i.in==in.B){
                n++;
            }
            if(i.in==in. E) {
                n--;
                if(MaxN<n){
                    res.start=i.value;
                }
            }
            if(MaxN<n){
                MaxN=n;
                res.end=i.value;
            }
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Segment> s =new ArrayList<>();
        s.add(new Segment(-3,1));
        s.add(new Segment(-4,1));
        s.add(new Segment(2,5));
        s.add(new Segment(1,6));
        s.add(new Segment(1,2));
        s.add(new Segment(0,3));
        s.add(new Segment(4,5));
        Segment R=solveProblem(s);
        System.out.println(R.start+" "+ R.end);
    }
}
