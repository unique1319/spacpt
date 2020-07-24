package util;

import com.wrh.draw.model.Canvas;
import com.wrh.draw.Pen;
import com.wrh.draw.PenG;
import com.wrh.draw.penimpl.TestPenImpl;
import com.wrh.util.imgframe.ImgFrame;

/**
 * @author wrh
 * @version 1.0
 * @date 2020/7/24 15:52
 * @describe
 */
public class PaintTestUtil {

    public static void paintTest(Canvas c, Pen pen) {
        PenG pg = new PenG();
        pg.paint(c, pen);
        ImgFrame.showImageFrame(pg.getImg());
    }

}
