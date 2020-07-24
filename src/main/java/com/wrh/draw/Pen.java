package com.wrh.draw;

import com.wrh.draw.penimpl.layer.AbstractLayer;

import java.awt.*;

/**
 * @author wrh
 * @version 1.0
 * @date 2020/7/23 17:58
 * @describe
 */
public interface Pen {

    /**
     * set layer style
     */
    AbstractLayer setStyle();

    /**
     * draw layer
     */
    AbstractLayer drawLayer(Graphics2D g);
}
