public class Main {
    public static void main(String[] args) {
        var boxerWeight = 78.2;
        var boxer2Weight = 82.7;
        var boxersWeight = boxerWeight + boxer2Weight;
        System.out.println("Общий вес боксеров" + boxersWeight + " кг. ");
        var boxersWeight2 =  boxerWeight - boxer2Weight;
        System.out.println("разница в весе боксеров" + boxersWeight2);
        var boxersWeight3 = (boxer2Weight - boxerWeight) % boxersWeight;
        System.out.println("разница в весе боксеров" + boxersWeight3 + " кг.");
        var totalTime = 640;
        var oneWorkerTime = 8;
        var allWorkes = totalTime / oneWorkerTime;
        System.out.println("всего работников в компании " + allWorkes + " человек");
        var workers = allWorkes + 94;
        var times = workers + oneWorkerTime;
        System.out.println("Если в компании работает " + workers + "человека, то всего" + times + " часов работы ");








    }
}