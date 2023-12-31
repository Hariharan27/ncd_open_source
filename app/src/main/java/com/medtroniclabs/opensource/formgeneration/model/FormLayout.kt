package com.medtroniclabs.opensource.formgeneration.model

import com.google.gson.annotations.SerializedName

data class FormLayout(
    override val viewType: String,
    override val id: String,
    override val title: String,
    var family: String? = null,
    var visibility: String?,
    var prefixText: String? = null,
    var isMandatory: Boolean = false,
    var maxLength: Int? = null,
    var minLength: Int? = null,
    var blockedCharacterSet: String? = null,
    var inputType: Int? = null,
    var orientation: Int? = null,
    var errorMessage: String? = null,
    var cultureErrorMessage: String? = null,
    var disableFutureDate: Boolean? = null,
    var minDate: Long? = null,
    var maxDate: Long? = null,
    var optionsList: ArrayList<Map<String, Any>>?,
    var isEnabled: Boolean? = null,
    var defaultValue: String? = null,
    var condition: ArrayList<ConditionalModel>? = null,
    var action: String? = null,
    var hint: String? = null,
    var isNeedAction: Boolean = false,
    var actionTitle: String? = null,
    var instructions: ArrayList<String>? = null,
    var instructionsCulture: ArrayList<String>? = null,
    var isSummary: Boolean? = null,
    var maxLines: Int? = null,
    var minValue: Double? = null,
    var maxValue: Double? = null,
    var pulseMinValue: Double? = null,
    var pulseMaxValue: Double? = null,
    var totalCount: Int? = null,
    var contentLength: Int? = null,
    var localDataCache: String? = null,
    var dependentID: String? = null,
    var unitMeasurement: String? = null,
    var isEditable:Boolean = false,
    var isCustomWorkflow: Boolean = false,
    @SerializedName("custom_workflow_id")
    var customWorkflowId: String? = null,
    var startValue: Double? = null,
    var endValue: Double? = null,
    var interval: Double? = null,
    var isAboveUpperLimit: Boolean = false,
    var optionType:String?= null,
    var mandatoryCount: Int? = null,
    var titleCulture:String? = null,
    var hintCulture:String?= null
) : BaseViewParams
