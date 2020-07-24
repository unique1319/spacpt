package com.wrh.draw.penimpl.layer.polygon;

import com.wrh.draw.model.PolygonPx;
import com.wrh.draw.penimpl.layer.AbstractLayer;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

/**
 * @author wrh
 * @version 1.0
 * @date 2020/7/24 10:20
 * @describe
 */
public class PolygonLayer extends AbstractLayer {

    @Getter
    @Setter
    private PolygonPx polygonPx;


    public PolygonLayer setStyle() {
        return this;
    }

    public PolygonLayer drawLayer(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.drawPolygon(this.polygonPx.getXPoints(), this.polygonPx.getYPoints(), this.polygonPx.getNPoints());
        return this;
    }
}
