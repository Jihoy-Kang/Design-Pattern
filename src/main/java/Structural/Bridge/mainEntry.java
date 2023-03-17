package Structural.Bridge;

public class mainEntry {
    public static void main(String[] args) {
        String title = "복원된 지구";
        String author = "강지효";
        String[] content = {"플라스틱 사용 감서와", "바다 생물 어획량 감소로 인하여", "지구는 복원되었다."};

        Draft draft = new Draft(title, author, content);
        Display display = new SimpleDisplay();
        draft.print(display);

        Display display1 = new CapthionDisplay();
        draft.print(display1);

        String publisher = "출판";
        int cost = 15000;

        Publication publication = new Publication(title,author,content,publisher,cost);

        publication.print(display1);
    }
}
