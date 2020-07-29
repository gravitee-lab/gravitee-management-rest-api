/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.rest.api.repository.proxy;

import io.gravitee.repository.exceptions.TechnicalException;
import io.gravitee.repository.management.api.PageRepository;
import io.gravitee.repository.management.api.PageRevisionRepository;
import io.gravitee.repository.management.api.search.PageCriteria;
import io.gravitee.repository.management.model.Page;
import io.gravitee.repository.management.model.PageReferenceType;
import io.gravitee.repository.management.model.PageRevision;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * @author Eric LELEU (eric.leleu at graviteesource.com)
 * @author GraviteeSource Team
 */
@Component
public class PageRevisionRepositoryProxy extends AbstractProxy<PageRevisionRepository> implements PageRevisionRepository {
    @Override
    public void deleteAllByPageId(String pageId) throws TechnicalException {
        target.deleteAllByPageId(pageId);
    }

    @Override
    public List<PageRevision> findAllByPageId(String pageId) throws TechnicalException {
        return target.findAllByPageId(pageId);
    }

    @Override
    public Optional<PageRevision> findLastByPageId(String pageId) throws TechnicalException {
        return target.findLastByPageId(pageId);
    }

    @Override
    public Optional<PageRevision> findById(String s) throws TechnicalException {
        return target.findById(s);
    }

    @Override
    public PageRevision create(PageRevision item) throws TechnicalException {
        return target.create(item);
    }

    @Override
    public PageRevision update(PageRevision item) throws TechnicalException {
        return target.update(item);
    }

    @Override
    public void delete(String s) throws TechnicalException {
        this.target.delete(s);
    }
}
