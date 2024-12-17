package uz.pdp;

import java.util.ArrayList;
import java.util.List;

public interface DB {
    List<String> objects=new ArrayList<>(List.of("Book","Pen","Ruler","Note","Laptop","Window"));
    List<String> randomObject=new ArrayList<>();
}
