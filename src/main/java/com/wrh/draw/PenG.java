package com.wrh.draw;

import com.wrh.draw.model.Canvas;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @author wrh
 * @version 1.0
 * @date 2020/7/23 17:27
 * @describe
 */

@NoArgsConstructor
public class PenG {

    private Graphics2D g = null;

    @Getter
    private BufferedImage img = null;


    private void Dispose() {
        if (g != null) {
            g.dispose();
        }
    }

    public void paint(Canvas c, Pen p) {
        if (c != null) {
            img = new BufferedImage(c.getCanvasWidth(), c.getCanvasHeight(), BufferedImage.TYPE_4BYTE_ABGR);
            g = img.createGraphics();
        } else {
            throw new NullPointerException("Canvas 不能为NULL");
        }
        p.drawLayer(g);
        this.Dispose();
    }
}
