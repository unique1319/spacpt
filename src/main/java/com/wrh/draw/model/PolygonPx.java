package com.wrh.draw.model;

import com.wrh.draw.exception.PolygonPxLossException;

import java.util.List;

/**
 * @author wrh
 * @version 1.0
 * @date 2020/7/24 10:28
 * @describe
 */
public class PolygonPx extends LinePx {

    // Polygon close circle point
    public PointPx startPointPx;

    public PolygonPx(List<PointPx> pointPxList) throws PolygonPxLossException {
        super();
        super.addAll(pointPxList);
    }

    public PolygonPx(LinePx linePx) {
        super();
        super.addAll(linePx.pointPxList);
    }

    public PolygonPx() {
        super();
    }

    @Override
    public void add(PointPx p) {
        if (this.pointPxList.size() == 0) {
            super.add(p);
            this.setStartPointPx();
        } else {
            super.add(p);
        }

    }

    @Override
    public void addAll(List<PointPx> ps) {
        if (this.pointPxList.size() != 0) {
            super.addAll(ps);
        } else {
            super.addAll(ps);
            this.setStartPointPx();
        }
    }

    @Override
    public void clear() {
        super.clear();
        this.startPointPx = null;
    }

    private void setStartPointPx() {
        if (this.pointPxList.size() != 0) {
            this.startPointPx = this.pointPxList.get(0);
        }
    }

}
