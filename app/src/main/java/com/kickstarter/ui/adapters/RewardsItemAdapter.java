package com.kickstarter.ui.adapters;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.View;

import com.kickstarter.R;
import com.kickstarter.models.RewardsItem;
import com.kickstarter.ui.viewholders.KSViewHolder;
import com.kickstarter.ui.viewholders.RewardsItemViewHolder;

import java.util.List;

import static java.util.Collections.emptyList;

public final class RewardsItemAdapter extends KSAdapter {

  public RewardsItemAdapter() {
    addSection(emptyList());
  }

  public void rewardsItems(final @NonNull List<RewardsItem> rewardsItems) {
    setSection(0, rewardsItems);
    notifyDataSetChanged();
  }

  @Override
  protected int layout(final @NonNull SectionRow sectionRow) {
    return R.layout.rewards_item_view;
  }

  @Override
  protected @NonNull KSViewHolder viewHolder(final @LayoutRes int layout, final @NonNull View view) {
    return new RewardsItemViewHolder(view);
  }
}
