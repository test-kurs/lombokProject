import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString(callSuper=true, includeFieldNames=false)
//@ToString
public class Lombok {

    @Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC)
    private String name;

    @Getter(AccessLevel.PROTECTED) @Setter(AccessLevel.PROTECTED)
    @ToString.Exclude private int age;

    @Getter @Setter
    private Date date;
}
