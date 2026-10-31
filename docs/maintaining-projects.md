# Adding and updating projects

[All projects](../README.md) · [Project template](../templates/project/README.md)

## Where everything goes

| Location | Purpose |
| --- | --- |
| `README.md` | Portfolio title page and project selector |
| `projects/<project-id>/README.md` | One project's overview and navigation |
| `projects/<project-id>/*.md` | That project's story, galleries, costs, results, and sources |
| `projects/<project-id>/media/` | That project's images, video copies, receipts, and manifest |
| `templates/project/README.md` | Starting point for a new project |
| `AGENTS.md` | Instructions for ChatGPT and other coding assistants |

The current project IDs are `rc-airplane`, `modot-bridge-2026`, and `gear-calculator`. Each project is self-contained. The front page stays a short selection page.

## Add a project

1. Choose a short, stable lowercase ID with hyphens, such as `robotics-2027`.
2. Copy the [project template](../templates/project/README.md) into `projects/<project-id>/README.md`.
3. Replace the placeholders with confirmed information. Add only the supporting pages that the project needs.
4. Put media under that project's `media/` folder. Use `photos/`, `videos/`, `thumbnails/`, `receipts/`, or `drawings/` as needed; create folders when they have files.
5. Link the supporting pages from the project overview. Add an **All projects** link back to the root README on every page.
6. Add one row to the root project table with the project name, brief description, status, and overview link.
7. Check the new links and images in GitHub before finishing.

## Suggested project pages

| Page | Use it for |
| --- | --- |
| `build-log.md` | First-person story, dated progress, decisions, setbacks, and lessons |
| `photos.md` | One scrolling gallery, ordered by capture date where known |
| `videos.md` | Click-to-open clips, descriptions, dates, and durations where confirmed |
| `parts-and-costs.md` | Materials, quantities, actual prices, and clearly scoped totals |
| `receipts.md` | Purchase records with personal/order information covered |
| `results.md` | Measurements, units, testing observations, and remaining blank fields |
| `sources.md` | References, attribution, assumptions, and unresolved details |

These are optional. Avoid creating empty pages just to fill out the list.

## Media rules

- Keep each file with its project. Keep source filenames when practical, and record renamed files in the manifest.
- Use capture dates for ordering. If they are unavailable, label the order as approximate. Upload timestamps are not build dates.
- Compare file hashes before removing a duplicate. Keep separate files when their content differs, even if the filenames are similar.
- Store one copy of an identical image and point every reference to it. Preserve original names and duplicate mappings in `media/manifest.json`.
- Keep original-source hashes separate from hashes of converted or compressed viewing copies. Git blob hashes and SHA-256 checksums are different fields.
- Keep thumbnails separate from photos. Videos open only after a visitor selects a link or thumbnail.
- Preserve receipt redactions. Keep external-only media clearly labeled; a private account link does not make a video available to other visitors.
- Update gallery links and manifest paths together whenever files move.

## Update an existing project

Start with its README and the relevant page. Add new information in that project only, then update its overview and the root table if its status changes. Preserve the first-person story, design credits, uncertain dates, and blank results until confirmed information is available.

For the bridge, update `results.md` after testing. The existing two videos are externally linked; upload destinations are documented in its media inventory.

For the airplane, keep actual purchase prices and the documented subtotal separate from estimates, taxes, shipping, and undocumented costs.

## Prompts to reuse

**Add a project**

> Read AGENTS.md and use templates/project/README.md to add a new project called [name] under projects/[project-id]/. Use the details and media I provide. Add it to the project selector, keep unknown information labeled, and check all links.

**Update one project**

> Read AGENTS.md and projects/[project-id]/README.md. Add this update to that project's story and media pages. Keep the portfolio front page as a project selector. Preserve existing facts and flag anything that needs confirmation.

**Add photos or videos**

> Add these files to projects/[project-id]/media/. Check for exact duplicates, preserve the originals or identify viewing copies, update the manifest, and add them to the matching gallery in confirmed or clearly approximate order.

## If usage becomes unavailable

Pause and record the current branch/commit, completed changes, remaining work, and any blocked uploads before stopping, if a write is still possible. Resume from that checkpoint once access is available; check the current repository state before repeating a write.
