public class Main {

    public static void main(String[] args) {

        Employer[] employers = new Employer[5];
        employers[0] = new Employer("Фу Фа Фо", "Работяга", "fufafo@roga.ru", "8(499)1111111", 50000, 32);
        employers[1] = new Employer("Пу Па По", "Работяга", "pupapo@roga.ru", "8(499)1111112", 52000, 24);
        employers[2] = new Employer("Му Ма Мо", "Сгибатель труб 1-го разряда", "mumamo@roga.ru", "8(499)1111113", 70000, 42);
        employers[3] = new Employer("Бу Ба Бо", "Менеджер", "bubabo@roga.ru", "8(499)1111114", 100000, 40);
        employers[4] = new Employer("Су Са Со", "Директор", "susaso@roga.ru", "8(499)1111115", 200000, 54);

        for (Employer employer : employers) {               //это не я, это все идея )) с таким условием для массивов и листов в целом знаком,
            if (employer.age > 40)                          //но уже не особо помню синтаксис, выходит что то вроде
                employer.showEmployerInformation();         //тип_данных переменная : массив или лист по которому хотим пройтись
        }

    }
}
