
      
void main() {
        List<String> names = Arrays.asList("mangesh", "pawan", "gaurav");
        Consumer<String> consumer = values -> System.out.println(values);
        names.forEach(consumer);

    }
