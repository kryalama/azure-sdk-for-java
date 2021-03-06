/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.StreamingJob;
import rx.Observable;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.StreamingJobSku;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.JobType;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.OutputStartMode;
import org.joda.time.DateTime;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.EventsOutOfOrderPolicy;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.OutputErrorPolicy;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.CompatibilityLevel;
import java.util.List;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.JobStorageAccount;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.ContentStoragePolicy;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.External;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.ClusterInfo;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Identity;
import java.util.ArrayList;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Function;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Input;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Output;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Transformation;

class StreamingJobImpl extends GroupableResourceCoreImpl<StreamingJob, StreamingJobInner, StreamingJobImpl, StreamAnalyticsManager> implements StreamingJob, StreamingJob.Definition, StreamingJob.Update {
    private String cifMatch;
    private String cifNoneMatch;
    private String uifMatch;
    StreamingJobImpl(String name, StreamingJobInner inner, StreamAnalyticsManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<StreamingJob> createResourceAsync() {
        StreamingJobsInner client = this.manager().inner().streamingJobs();
        return client.createOrReplaceAsync(this.resourceGroupName(), this.name(), this.inner(), this.cifMatch, this.cifNoneMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<StreamingJob> updateResourceAsync() {
        StreamingJobsInner client = this.manager().inner().streamingJobs();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.inner(), this.uifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<StreamingJobInner> getInnerAsync() {
        StreamingJobsInner client = this.manager().inner().streamingJobs();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public ClusterInfo cluster() {
        return this.inner().cluster();
    }

    @Override
    public CompatibilityLevel compatibilityLevel() {
        return this.inner().compatibilityLevel();
    }

    @Override
    public ContentStoragePolicy contentStoragePolicy() {
        return this.inner().contentStoragePolicy();
    }

    @Override
    public DateTime createdDate() {
        return this.inner().createdDate();
    }

    @Override
    public String dataLocale() {
        return this.inner().dataLocale();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public Integer eventsLateArrivalMaxDelayInSeconds() {
        return this.inner().eventsLateArrivalMaxDelayInSeconds();
    }

    @Override
    public Integer eventsOutOfOrderMaxDelayInSeconds() {
        return this.inner().eventsOutOfOrderMaxDelayInSeconds();
    }

    @Override
    public EventsOutOfOrderPolicy eventsOutOfOrderPolicy() {
        return this.inner().eventsOutOfOrderPolicy();
    }

    @Override
    public External externals() {
        return this.inner().externals();
    }

    @Override
    public List<Function> functions() {
        List<Function> lst = new ArrayList<Function>();
        if (this.inner().functions() != null) {
            for (FunctionInner inner : this.inner().functions()) {
                lst.add( new FunctionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public Identity identity() {
        return this.inner().identity();
    }

    @Override
    public List<Input> inputs() {
        List<Input> lst = new ArrayList<Input>();
        if (this.inner().inputs() != null) {
            for (InputInner inner : this.inner().inputs()) {
                lst.add( new InputImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String jobId() {
        return this.inner().jobId();
    }

    @Override
    public String jobState() {
        return this.inner().jobState();
    }

    @Override
    public JobStorageAccount jobStorageAccount() {
        return this.inner().jobStorageAccount();
    }

    @Override
    public JobType jobType() {
        return this.inner().jobType();
    }

    @Override
    public DateTime lastOutputEventTime() {
        return this.inner().lastOutputEventTime();
    }

    @Override
    public OutputErrorPolicy outputErrorPolicy() {
        return this.inner().outputErrorPolicy();
    }

    @Override
    public List<Output> outputs() {
        List<Output> lst = new ArrayList<Output>();
        if (this.inner().outputs() != null) {
            for (OutputInner inner : this.inner().outputs()) {
                lst.add( new OutputImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public OutputStartMode outputStartMode() {
        return this.inner().outputStartMode();
    }

    @Override
    public DateTime outputStartTime() {
        return this.inner().outputStartTime();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public StreamingJobSku sku() {
        return this.inner().sku();
    }

    @Override
    public Transformation transformation() {
        TransformationInner inner = this.inner().transformation();
        if (inner != null) {
            return  new TransformationImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public StreamingJobImpl withIfNoneMatch(String ifNoneMatch) {
        this.cifNoneMatch = ifNoneMatch;
        return this;
    }

    @Override
    public StreamingJobImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public StreamingJobImpl withCluster(ClusterInfo cluster) {
        this.inner().withCluster(cluster);
        return this;
    }

    @Override
    public StreamingJobImpl withCompatibilityLevel(CompatibilityLevel compatibilityLevel) {
        this.inner().withCompatibilityLevel(compatibilityLevel);
        return this;
    }

    @Override
    public StreamingJobImpl withContentStoragePolicy(ContentStoragePolicy contentStoragePolicy) {
        this.inner().withContentStoragePolicy(contentStoragePolicy);
        return this;
    }

    @Override
    public StreamingJobImpl withDataLocale(String dataLocale) {
        this.inner().withDataLocale(dataLocale);
        return this;
    }

    @Override
    public StreamingJobImpl withEventsLateArrivalMaxDelayInSeconds(Integer eventsLateArrivalMaxDelayInSeconds) {
        this.inner().withEventsLateArrivalMaxDelayInSeconds(eventsLateArrivalMaxDelayInSeconds);
        return this;
    }

    @Override
    public StreamingJobImpl withEventsOutOfOrderMaxDelayInSeconds(Integer eventsOutOfOrderMaxDelayInSeconds) {
        this.inner().withEventsOutOfOrderMaxDelayInSeconds(eventsOutOfOrderMaxDelayInSeconds);
        return this;
    }

    @Override
    public StreamingJobImpl withEventsOutOfOrderPolicy(EventsOutOfOrderPolicy eventsOutOfOrderPolicy) {
        this.inner().withEventsOutOfOrderPolicy(eventsOutOfOrderPolicy);
        return this;
    }

    @Override
    public StreamingJobImpl withExternals(External externals) {
        this.inner().withExternals(externals);
        return this;
    }

    @Override
    public StreamingJobImpl withFunctions(List<FunctionInner> functions) {
        this.inner().withFunctions(functions);
        return this;
    }

    @Override
    public StreamingJobImpl withIdentity(Identity identity) {
        this.inner().withIdentity(identity);
        return this;
    }

    @Override
    public StreamingJobImpl withInputs(List<InputInner> inputs) {
        this.inner().withInputs(inputs);
        return this;
    }

    @Override
    public StreamingJobImpl withJobStorageAccount(JobStorageAccount jobStorageAccount) {
        this.inner().withJobStorageAccount(jobStorageAccount);
        return this;
    }

    @Override
    public StreamingJobImpl withJobType(JobType jobType) {
        this.inner().withJobType(jobType);
        return this;
    }

    @Override
    public StreamingJobImpl withOutputErrorPolicy(OutputErrorPolicy outputErrorPolicy) {
        this.inner().withOutputErrorPolicy(outputErrorPolicy);
        return this;
    }

    @Override
    public StreamingJobImpl withOutputs(List<OutputInner> outputs) {
        this.inner().withOutputs(outputs);
        return this;
    }

    @Override
    public StreamingJobImpl withOutputStartMode(OutputStartMode outputStartMode) {
        this.inner().withOutputStartMode(outputStartMode);
        return this;
    }

    @Override
    public StreamingJobImpl withOutputStartTime(DateTime outputStartTime) {
        this.inner().withOutputStartTime(outputStartTime);
        return this;
    }

    @Override
    public StreamingJobImpl withSku(StreamingJobSku sku) {
        this.inner().withSku(sku);
        return this;
    }

    @Override
    public StreamingJobImpl withTransformation(TransformationInner transformation) {
        this.inner().withTransformation(transformation);
        return this;
    }

}
