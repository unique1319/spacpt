package com.wrh.draw.exception;

/**
 * @author wrh
 * @version 1.0
 * @date 2020/7/24 11:32
 * @describe
 */
public class PolygonPxLossException extends Exception {

    public PolygonPxLossException() {
        super("PolygonPx点个个数至少为3");
    }
}
