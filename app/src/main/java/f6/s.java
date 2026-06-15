package f6;

import java.util.Arrays;
import java.util.List;
/* compiled from: DependencyCycleException.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class s extends t {

    /* renamed from: a  reason: collision with root package name */
    private final List<c<?>> f25475a;

    public s(List<c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f25475a = list;
    }
}
