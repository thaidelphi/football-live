package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class g1 {

    /* renamed from: a  reason: collision with root package name */
    private static int f6021a;

    /* renamed from: b  reason: collision with root package name */
    private static int f6022b;

    /* renamed from: c  reason: collision with root package name */
    private static int f6023c;

    /* renamed from: d  reason: collision with root package name */
    private static int f6024d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {
        static int a(WindowManager windowManager) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            return point.y;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {
        static int a(WindowManager windowManager) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            return point.x;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float a(android.view.View r9, android.content.Context r10, boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.g1.a(android.view.View, android.content.Context, boolean, boolean, boolean, boolean):float");
    }

    private static float b(View view) {
        if (view == null) {
            return 0.0f;
        }
        if (a() < 11) {
            return 1.0f;
        }
        return view.getAlpha();
    }

    private static boolean c(View view) {
        if (view == null) {
            return false;
        }
        return view.getBackground() == null || (a() > 18 && view.getBackground().getAlpha() == 0);
    }

    private static int b(Context context) {
        int width;
        int i10;
        int i11;
        int i12 = context != null ? context.getResources().getConfiguration().orientation : -1;
        if (i12 != 2 || (i11 = f6022b) <= 0) {
            if (i12 != 1 || (i10 = f6024d) <= 0) {
                try {
                    WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
                    if (a() >= 13) {
                        width = b.a(windowManager);
                    } else {
                        width = windowManager.getDefaultDisplay().getWidth();
                    }
                    if (i12 == 2) {
                        f6022b = width;
                    } else if (i12 == 1) {
                        f6024d = width;
                    }
                    return width;
                } catch (Exception unused) {
                    return 0;
                }
            }
            return i10;
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static float a(android.view.View r11, android.graphics.Rect r12, float r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.g1.a(android.view.View, android.graphics.Rect, float, boolean):float");
    }

    private static Rect a(Rect rect, Rect rect2, int i10) {
        Rect rect3 = new Rect();
        switch (i10) {
            case 1:
                rect3.set(rect.left, rect.top, rect2.left, rect2.top);
                break;
            case 2:
                rect3.set(rect2.left, rect.top, rect2.right, rect2.top);
                break;
            case 3:
                rect3.set(rect2.right, rect.top, rect.right, rect2.top);
                break;
            case 4:
                rect3.set(rect2.right, rect2.top, rect.right, rect2.bottom);
                break;
            case 5:
                rect3.set(rect2.right, rect2.bottom, rect.right, rect.bottom);
                break;
            case 6:
                rect3.set(rect2.left, rect2.bottom, rect2.right, rect.bottom);
                break;
            case 7:
                rect3.set(rect.left, rect2.bottom, rect2.left, rect.bottom);
                break;
            case 8:
                rect3.set(rect.left, rect2.top, rect2.left, rect2.bottom);
                break;
        }
        return rect3;
    }

    private static ArrayList<View> a(View view) {
        if ((view instanceof ViewGroup) && view.getVisibility() == 0 && b(view) != 0.0f) {
            LinkedList linkedList = new LinkedList();
            ArrayList<View> arrayList = new ArrayList<>();
            linkedList.add((ViewGroup) view);
            ListIterator listIterator = linkedList.listIterator();
            while (listIterator.hasNext()) {
                ViewGroup viewGroup = (ViewGroup) listIterator.next();
                listIterator.remove();
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0 && b(childAt) != 0.0f) {
                        if (childAt instanceof ViewGroup) {
                            if (c(childAt)) {
                                listIterator.add((ViewGroup) childAt);
                                listIterator.previous();
                            } else {
                                arrayList.add(childAt);
                            }
                        } else if (!c(childAt)) {
                            arrayList.add(childAt);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }

    private static int a(Context context) {
        int height;
        int i10;
        int i11;
        int i12 = context != null ? context.getResources().getConfiguration().orientation : -1;
        if (i12 != 2 || (i11 = f6021a) <= 0) {
            if (i12 != 1 || (i10 = f6023c) <= 0) {
                try {
                    WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
                    if (a() >= 13) {
                        height = a.a(windowManager);
                    } else {
                        height = windowManager.getDefaultDisplay().getHeight();
                    }
                    if (i12 == 2) {
                        f6021a = height;
                    } else if (i12 == 1) {
                        f6023c = height;
                    }
                    return height;
                } catch (Exception unused) {
                    return 0;
                }
            }
            return i10;
        }
        return i11;
    }

    private static int a() {
        return Build.VERSION.SDK_INT;
    }
}
