package androidx.core.view;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
/* compiled from: ViewParentCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e0 {

    /* compiled from: ViewParentCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a {
        static boolean a(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
            return viewParent.onNestedFling(view, f10, f11, z10);
        }

        static boolean b(ViewParent viewParent, View view, float f10, float f11) {
            return viewParent.onNestedPreFling(view, f10, f11);
        }

        static void c(ViewParent viewParent, View view, int i10, int i11, int[] iArr) {
            viewParent.onNestedPreScroll(view, i10, i11, iArr);
        }

        static void d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13) {
            viewParent.onNestedScroll(view, i10, i11, i12, i13);
        }

        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.onNestedScrollAccepted(view, view2, i10);
        }

        static boolean f(ViewParent viewParent, View view, View view2, int i10) {
            return viewParent.onStartNestedScroll(view, view2, i10);
        }

        static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return a.a(viewParent, view, f10, f11, z10);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e8);
                return false;
            }
        } else if (viewParent instanceof s) {
            return ((s) viewParent).onNestedFling(view, f10, f11, z10);
        } else {
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return a.b(viewParent, view, f10, f11);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e8);
                return false;
            }
        } else if (viewParent instanceof s) {
            return ((s) viewParent).onNestedPreFling(view, f10, f11);
        } else {
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i10, int i11, int[] iArr, int i12) {
        if (viewParent instanceof q) {
            ((q) viewParent).k(view, i10, i11, iArr, i12);
        } else if (i12 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    a.c(viewParent, view, i10, i11, iArr);
                } catch (AbstractMethodError e8) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e8);
                }
            } else if (viewParent instanceof s) {
                ((s) viewParent).onNestedPreScroll(view, i10, i11, iArr);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (viewParent instanceof r) {
            ((r) viewParent).m(view, i10, i11, i12, i13, i14, iArr);
            return;
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (viewParent instanceof q) {
            ((q) viewParent).n(view, i10, i11, i12, i13, i14);
        } else if (i14 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    a.d(viewParent, view, i10, i11, i12, i13);
                } catch (AbstractMethodError e8) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e8);
                }
            } else if (viewParent instanceof s) {
                ((s) viewParent).onNestedScroll(view, i10, i11, i12, i13);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof q) {
            ((q) viewParent).i(view, view2, i10, i11);
        } else if (i11 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    a.e(viewParent, view, view2, i10);
                } catch (AbstractMethodError e8) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e8);
                }
            } else if (viewParent instanceof s) {
                ((s) viewParent).onNestedScrollAccepted(view, view2, i10);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof q) {
            return ((q) viewParent).o(view, view2, i10, i11);
        }
        if (i11 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    return a.f(viewParent, view, view2, i10);
                } catch (AbstractMethodError e8) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e8);
                    return false;
                }
            } else if (viewParent instanceof s) {
                return ((s) viewParent).onStartNestedScroll(view, view2, i10);
            } else {
                return false;
            }
        }
        return false;
    }

    public static void g(ViewParent viewParent, View view, int i10) {
        if (viewParent instanceof q) {
            ((q) viewParent).j(view, i10);
        } else if (i10 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    a.g(viewParent, view);
                } catch (AbstractMethodError e8) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e8);
                }
            } else if (viewParent instanceof s) {
                ((s) viewParent).onStopNestedScroll(view);
            }
        }
    }
}
