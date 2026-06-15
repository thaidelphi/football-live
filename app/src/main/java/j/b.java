package j;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseMenuWrapper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    final Context f26746a;

    /* renamed from: b  reason: collision with root package name */
    private h<w.b, MenuItem> f26747b;

    /* renamed from: c  reason: collision with root package name */
    private h<w.c, SubMenu> f26748c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        this.f26746a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof w.b) {
            w.b bVar = (w.b) menuItem;
            if (this.f26747b == null) {
                this.f26747b = new h<>();
            }
            MenuItem menuItem2 = this.f26747b.get(menuItem);
            if (menuItem2 == null) {
                c cVar = new c(this.f26746a, bVar);
                this.f26747b.put(bVar, cVar);
                return cVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof w.c) {
            w.c cVar = (w.c) subMenu;
            if (this.f26748c == null) {
                this.f26748c = new h<>();
            }
            SubMenu subMenu2 = this.f26748c.get(cVar);
            if (subMenu2 == null) {
                f fVar = new f(this.f26746a, cVar);
                this.f26748c.put(cVar, fVar);
                return fVar;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        h<w.b, MenuItem> hVar = this.f26747b;
        if (hVar != null) {
            hVar.clear();
        }
        h<w.c, SubMenu> hVar2 = this.f26748c;
        if (hVar2 != null) {
            hVar2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i10) {
        if (this.f26747b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f26747b.size()) {
            if (this.f26747b.i(i11).getGroupId() == i10) {
                this.f26747b.k(i11);
                i11--;
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i10) {
        if (this.f26747b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f26747b.size(); i11++) {
            if (this.f26747b.i(i11).getItemId() == i10) {
                this.f26747b.k(i11);
                return;
            }
        }
    }
}
