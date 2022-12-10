package ru.otus.homework.exceptiontask;

class Toy {
    private int cost = 0;

    public Toy(int cost){
        try {
            if (cost <= 0){
                throw new Exception();
            }
        }catch (Exception e){
            this.cost = 100;
            System.out.println("Цена некорректна, поставлена цена по умолчанию " + this.cost);
        }
    }
    void changeCost(int cost) {
        try {
            try {
                try {
                    if (cost <= 0) ;
                    throw new Exception();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
