package by.epam.training.task02.entity;

/**
 * Created by Higgs on 08.04.2015.
 */
public class TextObject {

    private TextComponent root;

    public TextObject(){
        root = new CompositeTextElement();
    }

    public TextComponent getRoot() {
        return root;
    }

    public void setRoot(TextComponent root) {
        this.root = root;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TextObject that = (TextObject) o;

        return !(root != null ? !root.equals(that.root) : that.root != null);
    }

    @Override
    public int hashCode() {
        return root != null ? root.hashCode() : 0;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TextObject{");
        sb.append("root=").append(root);
        sb.append('}');
        return sb.toString();
    }

}