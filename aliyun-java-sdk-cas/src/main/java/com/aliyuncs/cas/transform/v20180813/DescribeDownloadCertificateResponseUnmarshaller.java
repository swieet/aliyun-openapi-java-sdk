/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cas.transform.v20180813;

import com.aliyuncs.cas.model.v20180813.DescribeDownloadCertificateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDownloadCertificateResponseUnmarshaller {

	public static DescribeDownloadCertificateResponse unmarshall(DescribeDownloadCertificateResponse describeDownloadCertificateResponse, UnmarshallerContext context) {
		
		describeDownloadCertificateResponse.setRequestId(context.stringValue("DescribeDownloadCertificateResponse.RequestId"));
		describeDownloadCertificateResponse.setOssKey(context.stringValue("DescribeDownloadCertificateResponse.OssKey"));
	 
	 	return describeDownloadCertificateResponse;
	}
}