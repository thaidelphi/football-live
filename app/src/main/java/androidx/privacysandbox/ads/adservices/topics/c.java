package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.n;
/* compiled from: GetTopicsResponse.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f3723a;

    public c(List<e> topics) {
        n.f(topics, "topics");
        this.f3723a = topics;
    }

    public final List<e> a() {
        return this.f3723a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f3723a.size() != cVar.f3723a.size()) {
                return false;
            }
            return n.a(new HashSet(this.f3723a), new HashSet(cVar.f3723a));
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f3723a);
    }

    public String toString() {
        return "Topics=" + this.f3723a;
    }
}
