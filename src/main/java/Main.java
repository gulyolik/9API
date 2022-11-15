public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.subscription = true;
        post.patronymic = "Иванович";
        post.name = "Иван";
        post.surname = "Иванов";
        post.phone = "+7(999)-999-99-99";
        post.passport = "4444 № 44444444";
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }
}
