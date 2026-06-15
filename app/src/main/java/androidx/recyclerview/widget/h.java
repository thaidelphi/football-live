package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OpReorderer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    final a f4112a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OpReorderer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        a.b a(int i10, int i11, int i12, Object obj);

        void b(a.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(a aVar) {
        this.f4112a = aVar;
    }

    private int a(List<a.b> list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f3989a != 8) {
                z10 = true;
            } else if (z10) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<a.b> list, int i10, a.b bVar, int i11, a.b bVar2) {
        int i12 = bVar.f3992d;
        int i13 = bVar2.f3990b;
        int i14 = i12 < i13 ? -1 : 0;
        int i15 = bVar.f3990b;
        if (i15 < i13) {
            i14++;
        }
        if (i13 <= i15) {
            bVar.f3990b = i15 + bVar2.f3992d;
        }
        int i16 = bVar2.f3990b;
        if (i16 <= i12) {
            bVar.f3992d = i12 + bVar2.f3992d;
        }
        bVar2.f3990b = i16 + i14;
        list.set(i10, bVar2);
        list.set(i11, bVar);
    }

    private void d(List<a.b> list, int i10, int i11) {
        a.b bVar = list.get(i10);
        a.b bVar2 = list.get(i11);
        int i12 = bVar2.f3989a;
        if (i12 == 1) {
            c(list, i10, bVar, i11, bVar2);
        } else if (i12 == 2) {
            e(list, i10, bVar, i11, bVar2);
        } else if (i12 != 4) {
        } else {
            f(list, i10, bVar, i11, bVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(List<a.b> list) {
        while (true) {
            int a10 = a(list);
            if (a10 == -1) {
                return;
            }
            d(list, a10, a10 + 1);
        }
    }

    void e(List<a.b> list, int i10, a.b bVar, int i11, a.b bVar2) {
        boolean z10;
        int i12 = bVar.f3990b;
        int i13 = bVar.f3992d;
        boolean z11 = false;
        if (i12 < i13) {
            if (bVar2.f3990b == i12 && bVar2.f3992d == i13 - i12) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
        } else if (bVar2.f3990b == i13 + 1 && bVar2.f3992d == i12 - i13) {
            z10 = true;
            z11 = true;
        } else {
            z10 = true;
        }
        int i14 = bVar2.f3990b;
        if (i13 < i14) {
            bVar2.f3990b = i14 - 1;
        } else {
            int i15 = bVar2.f3992d;
            if (i13 < i14 + i15) {
                bVar2.f3992d = i15 - 1;
                bVar.f3989a = 2;
                bVar.f3992d = 1;
                if (bVar2.f3992d == 0) {
                    list.remove(i11);
                    this.f4112a.b(bVar2);
                    return;
                }
                return;
            }
        }
        int i16 = bVar.f3990b;
        int i17 = bVar2.f3990b;
        a.b bVar3 = null;
        if (i16 <= i17) {
            bVar2.f3990b = i17 + 1;
        } else {
            int i18 = bVar2.f3992d;
            if (i16 < i17 + i18) {
                bVar3 = this.f4112a.a(2, i16 + 1, (i17 + i18) - i16, null);
                bVar2.f3992d = bVar.f3990b - bVar2.f3990b;
            }
        }
        if (z11) {
            list.set(i10, bVar2);
            list.remove(i11);
            this.f4112a.b(bVar);
            return;
        }
        if (z10) {
            if (bVar3 != null) {
                int i19 = bVar.f3990b;
                if (i19 > bVar3.f3990b) {
                    bVar.f3990b = i19 - bVar3.f3992d;
                }
                int i20 = bVar.f3992d;
                if (i20 > bVar3.f3990b) {
                    bVar.f3992d = i20 - bVar3.f3992d;
                }
            }
            int i21 = bVar.f3990b;
            if (i21 > bVar2.f3990b) {
                bVar.f3990b = i21 - bVar2.f3992d;
            }
            int i22 = bVar.f3992d;
            if (i22 > bVar2.f3990b) {
                bVar.f3992d = i22 - bVar2.f3992d;
            }
        } else {
            if (bVar3 != null) {
                int i23 = bVar.f3990b;
                if (i23 >= bVar3.f3990b) {
                    bVar.f3990b = i23 - bVar3.f3992d;
                }
                int i24 = bVar.f3992d;
                if (i24 >= bVar3.f3990b) {
                    bVar.f3992d = i24 - bVar3.f3992d;
                }
            }
            int i25 = bVar.f3990b;
            if (i25 >= bVar2.f3990b) {
                bVar.f3990b = i25 - bVar2.f3992d;
            }
            int i26 = bVar.f3992d;
            if (i26 >= bVar2.f3990b) {
                bVar.f3992d = i26 - bVar2.f3992d;
            }
        }
        list.set(i10, bVar2);
        if (bVar.f3990b != bVar.f3992d) {
            list.set(i11, bVar);
        } else {
            list.remove(i11);
        }
        if (bVar3 != null) {
            list.add(i10, bVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void f(java.util.List<androidx.recyclerview.widget.a.b> r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f3992d
            int r1 = r13.f3990b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto Ld
            int r1 = r1 - r4
            r13.f3990b = r1
            goto L20
        Ld:
            int r5 = r13.f3992d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r4
            r13.f3992d = r5
            androidx.recyclerview.widget.h$a r0 = r8.f4112a
            int r1 = r11.f3990b
            java.lang.Object r5 = r13.f3991c
            androidx.recyclerview.widget.a$b r0 = r0.a(r2, r1, r4, r5)
            goto L21
        L20:
            r0 = r3
        L21:
            int r1 = r11.f3990b
            int r5 = r13.f3990b
            if (r1 > r5) goto L2b
            int r5 = r5 + r4
            r13.f3990b = r5
            goto L41
        L2b:
            int r6 = r13.f3992d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.h$a r3 = r8.f4112a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f3991c
            androidx.recyclerview.widget.a$b r3 = r3.a(r2, r1, r5, r4)
            int r1 = r13.f3992d
            int r1 = r1 - r5
            r13.f3992d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f3992d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.h$a r11 = r8.f4112a
            r11.b(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r3 == 0) goto L5e
            r9.add(r10, r3)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
