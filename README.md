# Smart Research Co-Pilot (scaffold)

Minimal scaffold for "Smart Research Co-Pilot" — a RAG system for research PDFs.

This workspace contains a simple FastAPI backend that accepts PDF uploads, extracts text,
creates embeddings using `sentence-transformers`, and stores vectors in a local FAISS index.

It also includes a minimal React/Tailwind frontend scaffold.

See `backend/` and `frontend/` for details.

Quick (local) setup for backend

1. Create a Python virtualenv and install dependencies:

```bash
python -m venv .venv
source .venv/bin/activate
pip install -r backend/requirements.txt
```

2. Start the API:

```bash
uvicorn backend.app.main:app --reload --port 8000
```

Upload PDFs at POST /upload (multipart/form-data `file`).

Notes
- This is an initial scaffold. The RAG endpoints and LLM calls are provided as a minimal working flow and stubs where API keys are required (OpenAI or other LLMs).
