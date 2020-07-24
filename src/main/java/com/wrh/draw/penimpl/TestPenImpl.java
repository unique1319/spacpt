package com.wrh.draw.penimpl;

import com.wrh.draw.Pen;
import com.wrh.draw.penimpl.layer.AbstractLayer;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * @author wrh
 * @version 1.0
 * @date 2020/7/24 9:20
 * @describe
 */
public class TestPenImpl implements Pen {

    public AbstractLayer drawLayer(Graphics2D g) {
        g.setColor(Color.BLACK);
        Ellipse2D.Double ellipse = new Ellipse2D.Double(20, 20, 100, 100);
        g.draw(ellipse);
        return null;
    }

    public AbstractLayer setStyle() {
        return null;
    }

}
