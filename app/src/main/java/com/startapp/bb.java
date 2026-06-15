package com.startapp;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.ug;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class bb {
    public static NotDisplayedReason a(View view, BannerOptions bannerOptions, AtomicReference<JSONObject> atomicReference) {
        int compare;
        int i10;
        NotDisplayedReason notDisplayedReason;
        View view2 = view;
        if (view2 == null) {
            return NotDisplayedReason.INTERNAL_ERROR;
        }
        if (bannerOptions.u()) {
            if (view.getParent() == null) {
                notDisplayedReason = NotDisplayedReason.VIEW_NOT_ATTACHED;
            } else if (view.getRootView() == null) {
                notDisplayedReason = NotDisplayedReason.VIEW_NOT_ATTACHED;
            } else if (view.getRootView().getParent() == null) {
                notDisplayedReason = NotDisplayedReason.VIEW_NOT_ATTACHED;
            } else if (!view.isShown()) {
                notDisplayedReason = NotDisplayedReason.VIEW_NOT_VISIBLE;
            } else {
                notDisplayedReason = (view.getWidth() < 1 || view.getHeight() < 1) ? NotDisplayedReason.VIEW_INVALID_SIZE : null;
            }
            if (notDisplayedReason != null) {
                return notDisplayedReason;
            }
        }
        if (bannerOptions.s() && !view.hasWindowFocus()) {
            return NotDisplayedReason.WINDOW_NOT_FOCUSED;
        }
        if (!bannerOptions.r()) {
            return null;
        }
        int height = ((view.getHeight() * view.getWidth()) * Math.min(Math.max(1, bannerOptions.h()), 100)) / 100;
        Rect rect = new Rect();
        if (!view2.getGlobalVisibleRect(rect)) {
            return NotDisplayedReason.AD_CLIPPED;
        }
        if (rect.isEmpty()) {
            return NotDisplayedReason.AD_CLIPPED;
        }
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        atomicReference.set(a(view2, rect, true));
        NotDisplayedReason notDisplayedReason2 = NotDisplayedReason.AD_CLIPPED;
        ViewGroup viewGroup = view2;
        while (true) {
            int i11 = 0;
            if (viewGroup.getParent() instanceof ViewGroup) {
                if (bannerOptions.t() && viewGroup.getVisibility() != 0) {
                    return NotDisplayedReason.VIEW_NOT_VISIBLE;
                }
                if (Build.VERSION.SDK_INT >= 11 && bannerOptions.q() && viewGroup.getAlpha() < 1.0f) {
                    return NotDisplayedReason.VIEW_TRANSPARENT;
                }
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                JSONObject a10 = a((View) viewGroup2, ((viewGroup2.getParent() instanceof ViewGroup) || !viewGroup2.getGlobalVisibleRect(rect2)) ? null : rect2, false);
                JSONObject jSONObject = atomicReference.get();
                JSONArray optJSONArray = a10.optJSONArray("children");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                    try {
                        a10.put("children", optJSONArray);
                    } catch (JSONException e8) {
                        throw new RuntimeException(e8);
                    }
                }
                optJSONArray.put(jSONObject);
                atomicReference.set(a10);
                int indexOfChild = viewGroup2.indexOfChild(viewGroup);
                int childCount = viewGroup2.getChildCount();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = viewGroup2.getChildAt(i12);
                    if (childAt == viewGroup) {
                        i10 = i11;
                    } else {
                        if (Build.VERSION.SDK_INT >= 21 ? (compare = Float.compare(childAt.getZ(), viewGroup.getZ())) >= 0 && (compare != 0 || i12 > indexOfChild) : i12 > indexOfChild) {
                            if (childAt != null && childAt.getVisibility() == 0 && childAt.getGlobalVisibleRect(rect2) && Rect.intersects(rect, rect2)) {
                                region.op(rect2, Region.Op.DIFFERENCE);
                                i10 = 0;
                                Object a11 = a(childAt, rect2, false);
                                JSONArray optJSONArray2 = a10.optJSONArray("children");
                                if (optJSONArray2 == null) {
                                    optJSONArray2 = new JSONArray();
                                    try {
                                        a10.put("children", optJSONArray2);
                                    } catch (JSONException e10) {
                                        throw new RuntimeException(e10);
                                    }
                                }
                                optJSONArray2.put(a11);
                                notDisplayedReason2 = NotDisplayedReason.AD_WAS_COVERED;
                            }
                        }
                        i10 = 0;
                    }
                    i12++;
                    i11 = i10;
                }
                viewGroup = viewGroup2;
            } else {
                RegionIterator regionIterator = new RegionIterator(region);
                while (regionIterator.next(rect2)) {
                    i11 += rect2.height() * rect2.width();
                    if (i11 >= height) {
                        return null;
                    }
                }
                return notDisplayedReason2;
            }
        }
    }

    public static JSONObject a(View view, Rect rect, boolean z10) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class", a(view));
            if (view.getId() == -1) {
                str = null;
            } else {
                try {
                    str = view.getContext().getResources().getResourceName(view.getId());
                } catch (Resources.NotFoundException unused) {
                    str = "0x" + Integer.toHexString(view.getId());
                }
            }
            if (str != null) {
                jSONObject.put(ug.f21009x, str);
            }
            if (z10) {
                jSONObject.put("target", true);
            }
            if (Build.VERSION.SDK_INT >= 11 && view.getAlpha() < 1.0f) {
                jSONObject.put("alpha", view.getAlpha());
            }
            if (rect != null) {
                jSONObject.put("left", rect.left);
                jSONObject.put("top", rect.top);
                jSONObject.put("right", rect.right);
                jSONObject.put("bottom", rect.bottom);
            }
            return jSONObject;
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static String a(View view) {
        String name = view.getClass().getName();
        if (!name.startsWith("android.") && !name.startsWith("androidx.") && !name.startsWith("com.android.")) {
            String packageName = view.getContext().getPackageName();
            StringBuilder sb = new StringBuilder();
            sb.append(packageName);
            sb.append(".");
            return name.startsWith(sb.toString()) ? name.substring(packageName.length()) : name;
        }
        return view.getClass().getSimpleName();
    }
}
