import com.wrh.draw.model.Canvas;
import com.wrh.draw.Pen;
import com.wrh.draw.PenG;
import com.wrh.draw.penimpl.TestPenImpl;
import org.junit.Test;
import com.wrh.util.imgframe.ImgFrame;

/**
 * @author wrh
 * @version 1.0
 * @date 2020/7/24 9:25
 * @describe
 */
public class PaintTest {

    @Test
    public void testPain() {
        Canvas c = new Canvas(200, 250);
        Pen pen = new TestPenImpl();
        PenG pg = new PenG();
        pg.paint(c, pen);
        ImgFrame.showImageFrame(pg.getImg());
    }

}
