package Behavior.Template;

public abstract class DisplayArticleTemplate {
    protected Article article; // protected를 사용하면 파생클래스에서 접근가능

    public DisplayArticleTemplate(Article article) {
        this.article = article;
    }

    public final void display() { // final 지정시 파생클래스에서 이 메서드를 변경할 수 없도록 강제한다.
        title();
        content();
        footer();
    }



    protected abstract void title();
    protected abstract void content();
    protected abstract void footer();
}
