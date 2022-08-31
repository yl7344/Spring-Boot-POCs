import React from 'react';
import { Index } from './components/index';

import '../css/main.scss';

import ReactDOMClient from 'react-dom/client';
const container = document.getElementById('content') as HTMLElement;
const root = reactDOMClient.createRoot(container);
root.render(<Index name = "index">);