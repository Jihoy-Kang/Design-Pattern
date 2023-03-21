package Behavior.Template;

import java.util.ArrayList;

public class mainEntry {
    public static void main(String[] args) {
        String title = "디자인패턴";
        ArrayList<String> content = new ArrayList<>();
        content.add("1111");
        content.add("2222");
        content.add("3333");

        String footer = "2023.03.21 디자인패턴, 강지효";

        Article article = new Article(title,content,footer);
        DisplayArticleTemplate style1 = new SimpleDisplayArticle(article);
        style1.display();

        DisplayArticleTemplate style2 = new CaptionDisplayArticle(article);
        style2.display();
    }
}
