package el.actor;

import java.util.ArrayList;
import java.util.List;

public class BaseActor {
    public int id;
    public int nameColor;
    public List<Span> name = new ArrayList<>();
    public Attribute materialPoints = new Attribute();
    public int x;
    public int y;
}
