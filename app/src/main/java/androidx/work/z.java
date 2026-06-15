package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
/* compiled from: WorkInfo.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private UUID f4829a;

    /* renamed from: b  reason: collision with root package name */
    private a f4830b;

    /* renamed from: c  reason: collision with root package name */
    private e f4831c;

    /* renamed from: d  reason: collision with root package name */
    private Set<String> f4832d;

    /* renamed from: e  reason: collision with root package name */
    private e f4833e;

    /* renamed from: f  reason: collision with root package name */
    private int f4834f;

    /* compiled from: WorkInfo.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean a() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public z(UUID uuid, a aVar, e eVar, List<String> list, e eVar2, int i10) {
        this.f4829a = uuid;
        this.f4830b = aVar;
        this.f4831c = eVar;
        this.f4832d = new HashSet(list);
        this.f4833e = eVar2;
        this.f4834f = i10;
    }

    public a a() {
        return this.f4830b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f4834f == zVar.f4834f && this.f4829a.equals(zVar.f4829a) && this.f4830b == zVar.f4830b && this.f4831c.equals(zVar.f4831c) && this.f4832d.equals(zVar.f4832d)) {
            return this.f4833e.equals(zVar.f4833e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f4829a.hashCode() * 31) + this.f4830b.hashCode()) * 31) + this.f4831c.hashCode()) * 31) + this.f4832d.hashCode()) * 31) + this.f4833e.hashCode()) * 31) + this.f4834f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f4829a + "', mState=" + this.f4830b + ", mOutputData=" + this.f4831c + ", mTags=" + this.f4832d + ", mProgress=" + this.f4833e + '}';
    }
}
