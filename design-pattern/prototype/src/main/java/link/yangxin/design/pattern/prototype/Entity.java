package link.yangxin.design.pattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yangxin
 * @date 2018/11/19
 */
@Data
@NoArgsConstructor
public class Entity implements Cloneable {

    private String id;

    private String name;

    private String msg;

    public Entity(String msg) {
        this.msg = msg;
    }

    @Override
    protected Entity clone() throws CloneNotSupportedException {
        return (Entity) super.clone();
    }
}