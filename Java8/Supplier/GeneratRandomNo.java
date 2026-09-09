
      
void main() {
        Supplier<Integer> supplier = () -> (int) (Math.random() * 100);
        for (int i = 0; i < 10; i++) {
            System.err.print(" "+supplier.get());
        }

    }
