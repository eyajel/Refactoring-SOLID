package OCP_respecté;

public abstract class Resource {
    public abstract int allocate();
    public abstract void free(int resourceId);
}