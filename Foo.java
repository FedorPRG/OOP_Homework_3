
public class Foo {
    private final int arg1;
    private final int arg2;
    private final int arg3;
    private final int arg4;
    private final int arg5;
    private final int arg6;

    public static class Builder {
        // Обязательные параметры
        private final int arg1;
        private final int arg2;
        // Дополнительные параметры - инициализируются значениями по умолчанию
        private int arg3 = 0;
        private int arg4 = 0;
        private int arg5 = 0;
        private int arg6 = 0;

        public Builder(int arg1, int arg2) {
            this.arg1 = arg1;
            this.arg2 = arg2;
        }

        public Builder arg3(int val) {
            arg3 = val;
            return this;
        }

        public Builder arg4(int val) {
            arg4 = val;
            return this;
        }

        public Builder arg5(int val) {
            arg5 = val;
            return this;
        }

        public Builder arg6(int val) {
            arg6 = val;
            return this;
        }

        public Foo build() {
            return new Foo(this);
        }

        @Override
        public String toString() {
            return String.format("%d %d %d %d %d %d\n", this.arg1, this.arg2, this.arg3, this.arg4, this.arg5,
                    this.arg6);
        }
    }

    private Foo(Builder builder) {
        arg1 = builder.arg1;
        arg2 = builder.arg2;
        arg3 = builder.arg3;
        arg4 = builder.arg4;
        arg5 = builder.arg5;
        arg6 = builder.arg6;

    }

    @Override
    public String toString() {
        return String.format("%d %d %d %d %d %d\n", this.arg1, this.arg2, this.arg3, this.arg4, this.arg5, this.arg6);
    }

    public static void main(String[] args) {
        System.out.println(
                new Foo.Builder(240, 8).arg3(100).arg4(35)
                        .arg5(27).arg6(7).build());
        System.out.println(
                new Foo.Builder(240, 8).arg3(100).arg4(35)
                        .build());
        System.out.println(
                new Foo.Builder(240, 8).arg4(35)
                        .arg5(27).arg6(7).build());

    }
}
