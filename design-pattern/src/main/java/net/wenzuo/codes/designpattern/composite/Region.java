package net.wenzuo.codes.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class Region {

    private Integer id;
    private String name;
    private List<Region> children;

    public Region(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(Region region) {
        this.children.add(region);
    }

    public void remove(Region region) {
        this.children.remove(region);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Region> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", children=" + children +
                '}';
    }

}