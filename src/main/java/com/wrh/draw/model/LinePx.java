package com.wrh.draw.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wrh
 * @version 1.0
 * @date 2020/7/24 10:28
 * @describe
 */
public class LinePx {

    public List<PointPx> pointPxList;

    public LinePx() {
        pointPxList = new ArrayList<PointPx>();
    }

    public void add(PointPx p) {
        this.pointPxList.add(p);

    }

    public void addAll(List<PointPx> ps) {
        this.pointPxList.addAll(ps);
    }

    public void clear() {
        this.pointPxList.clear();
    }

    public int[] getXPoints() {
        int[] x = new int[this.pointPxList.size()];
        for (int i = 0; i < this.pointPxList.size(); i++) {
            x[i] = this.pointPxList.get(i).getX();
        }
        return x;
    }

    public int[] getYPoints() {
        int[] y = new int[this.pointPxList.size()];
        for (int i = 0; i < this.pointPxList.size(); i++) {
            y[i] = this.pointPxList.get(i).getY();
        }
        return y;
    }

    public int getNPoints() {
        return this.pointPxList.size();
    }

}
