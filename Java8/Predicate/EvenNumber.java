
@ FunctionalInterface  

    interface EvenNumber {

        public abstract void test(int num);
    }

    void main() {
        Predicate<Integer> even = num -> num % 2 == 0;
        Boolean isValid = even.test(78);

        if (isValid) {
            IO.println("Even");
        } else {
            IO.println("Odd");
        }


    }
