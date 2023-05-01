public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Александр";
        post.surname = "Иванов";
        post.patronymic = "Игоревичь";
        post.phone = "+7-911-111-11-11";
        post.passport = "4321 № 321789";
        post.subscription = true;

        post.birthday.day = 15;
        post.birthday.mount = 3;
        post.birthday.year = 1900;

    }
}
