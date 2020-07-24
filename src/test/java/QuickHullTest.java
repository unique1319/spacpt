import com.wrh.draw.model.Canvas;
import com.wrh.draw.model.PointPx;
import com.wrh.draw.model.PolygonPx;
import com.wrh.draw.penimpl.layer.polygon.PolygonLayer;
import com.wrh.quickhull.QuickHull;
import com.wrh.quickhull.datastructures.LinkedList;
import com.wrh.quickhull.datastructures.LinkedListNode;
import org.junit.Test;
import util.PaintTestUtil;

import java.awt.geom.Point2D;

/**
 * @author wrh
 * @version 1.0
 * @date 2020/7/23 16:04
 * @describe 凸包算法测试
 */
public class QuickHullTest {

    @Test
    public void hullTest() {
        LinkedList points = new LinkedList();
        points.insert(new Point2D.Double(30.5, 112.3));
        points.insert(new Point2D.Double(26.1, 108.1));
        points.insert(new Point2D.Double(32.0, 103.5));
        points.insert(new Point2D.Double(28.8, 107));
        QuickHull quickHull = new QuickHull();
        LinkedList calcPoints = quickHull.useAlgorithm(points);
        LinkedListNode node = calcPoints.getHead();
        PolygonPx polygonPx = new PolygonPx();
        while (node != null) {
            Point2D.Double point = node.getPoint();
            polygonPx.add(new PointPx((int) Math.round(point.x), Math.round((int) point.y)));
            System.out.println("Point2D.Double(" + point.x + ", " + point.y + ")");
            node = node.getNext();
        }
        PolygonLayer polygonLayer = new PolygonLayer();
        polygonLayer.setPolygonPx(polygonPx);
        PaintTestUtil.paintTest(new Canvas(200, 200), polygonLayer);

    }

}
