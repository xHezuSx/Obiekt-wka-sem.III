package memory;

public interface MemoryManager {
    void allocateMemory(int size);
    default void freeMemory(){
        System.out.println("Memory Freed");
    }
    static String getMemoryType(){
        return "Memory Type";
    }
}
