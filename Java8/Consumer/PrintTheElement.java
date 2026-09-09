
      
void main() {
        List<String> names = Arrays.asList("mangesh", "pawan", "gaurav");
        Consumer<String> consumer = values -> System.err.println(values);
        names.forEach(consumer);

    }
