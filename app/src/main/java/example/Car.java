package example;

public class Car {

      Engine engine;
      Body body;
      Tyre tyre;

    public Car(Engine engine, Body body, Tyre tyre) {
        this.engine = engine;
        this.body = body;
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", body=" + body +
                ", tyre=" + tyre +
                '}';
    }
}
