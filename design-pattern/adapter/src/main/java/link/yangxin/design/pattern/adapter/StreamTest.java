package link.yangxin.design.pattern.adapter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author yangxin
 * @date 2019/4/16
 */
public class StreamTest {

    public static void main(String[] args) {
        // 构建一个stream流
        Stream<String> stream = Stream.of("yangxin", "liunjunyu", "huangcheng", "chenxuefeng");
        List<Integer> lengthList = stream.map((s) -> {
            return s.length();
        }).collect(Collectors.toList()); // 把每个字符串的长度放入到lengthList集合中
        System.out.println(lengthList);
        //System.out.println(stream.count()); // 流使用过就不能再次使用了，这句话将抛出异常
        lengthList.stream().mapToDouble((i) -> {
            return Double.valueOf(i) * 0.30D;
        }).forEach(System.out::println);

    }

}