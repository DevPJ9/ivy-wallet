package com.ivy.pie_charts

import com.ivy.core.ui.temp.trash.TimePeriod
import com.ivy.data.CategoryOld
import com.ivy.pie_charts.model.CategoryAmount

sealed class PieChartStatisticEvent {
    data class Start(val screen: Unit) : PieChartStatisticEvent()
    object OnSelectNextMonth : PieChartStatisticEvent()

    object OnSelectPreviousMonth : PieChartStatisticEvent()

    data class OnSetPeriod(val timePeriod: TimePeriod) : PieChartStatisticEvent()

    data class OnCategoryClicked(val category: CategoryOld?) :
        PieChartStatisticEvent()

    data class OnShowMonthModal(val timePeriod: TimePeriod?) : PieChartStatisticEvent()

    data class OnUnpackSubCategories(val unpackAllSubCategories: Boolean) : PieChartStatisticEvent()

    data class OnSubCategoryListExpanded(
        val parentCategoryAmount: CategoryAmount,
        val expandedState: Boolean
    ) : PieChartStatisticEvent()
}