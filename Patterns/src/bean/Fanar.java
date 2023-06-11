/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Igrar
 */
public class Fanar extends Device {

    private String name;
    private Mercedes m;

    private Fanar() {

    }

    private void setName(String name) {
        this.name = name;
    }

    private void setM(Mercedes m) {
        this.m = m;
    }

    public static FanarBuilder builder() {
        return new FanarBuilder();
    }

    public static class FanarBuilder {

        private Fanar f = null;

        public FanarBuilder builder() {
            f = new Fanar();
            return this;
        }

        public FanarBuilder setName(String name) {
            this.f.setName(name);
            return this;
        }

        public FanarBuilder setName(Mercedes m) {
            this.f.setM(m);
            return this;
        }

        public Fanar build() {
            return this.f;
        }

    }

    @Override
    public String toString() {
        return this.name + " "+this.m;
    }

}
