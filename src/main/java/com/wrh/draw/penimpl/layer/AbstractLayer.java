package com.wrh.draw.penimpl.layer;

import com.wrh.draw.Pen;
import lombok.Builder;

import java.awt.*;

/**
 * @author wrh
 * @version 1.0
 * @date 2020/7/24 10:07
 * @describe
 */

public abstract class AbstractLayer implements Pen {

    @Builder.Default
    Color bgColor = Color.BLACK;


}
