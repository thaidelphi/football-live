package a9;

import i8.w;
import java.util.Iterator;
/* compiled from: SequenceBuilder.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
class j {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a<T> implements f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t8.p f593a;

        public a(t8.p pVar) {
            this.f593a = pVar;
        }

        @Override // a9.f
        public Iterator<T> iterator() {
            return j.a(this.f593a);
        }
    }

    public static final <T> Iterator<T> a(t8.p<? super h<? super T>, ? super m8.d<? super w>, ? extends Object> block) {
        m8.d<? super w> a10;
        kotlin.jvm.internal.n.f(block, "block");
        g gVar = new g();
        a10 = n8.c.a(block, gVar, gVar);
        gVar.i(a10);
        return gVar;
    }

    public static final <T> f<T> b(t8.p<? super h<? super T>, ? super m8.d<? super w>, ? extends Object> block) {
        kotlin.jvm.internal.n.f(block, "block");
        return new a(block);
    }
}
